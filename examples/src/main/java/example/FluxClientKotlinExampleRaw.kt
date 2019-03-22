/**
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package example

import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.runBlocking
import org.influxdata.client.kotlin.InfluxDBClientKotlinFactory

fun main(args: Array<String>) = runBlocking {

    val fluxClient = InfluxDBClientKotlinFactory
            .create("http://localhost:8086?readTimeout=5000&connectTimeout=5000&logLevel=BASIC")

    val fluxQuery = ("from(bucket: \"telegraf\")\n"
            + " |> filter(fn: (r) => (r[\"_measurement\"] == \"cpu\" AND r[\"_field\"] == \"usage_system\"))"
            + " |> range(start: -5m)"
            + " |> sample(n: 5, pos: 1)")

    //Result is returned as a stream
    val results = fluxClient.getQueryKotlinApi().queryRaw(fluxQuery, "my-org")

    //print results
    results.consumeEach { println("Line: $it") }

    fluxClient.close()
}
