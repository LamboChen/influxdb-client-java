/*
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
package org.influxdata.platform;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;

import org.influxdata.platform.write.Point;
import org.influxdata.platform.write.event.AbstractWriteEvent;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import org.reactivestreams.Publisher;

/**
 * Write time-series data into InfluxData Platform 2.0.
 * <p>
 * The data are formatted in <a href="https://bit.ly/2QL99fu">Line Protocol</a>.
 *
 * @author Jakub Bednar (bednar@github) (22/11/2018 06:49)
 */
public interface WriteClientReactive extends AutoCloseable {

    /**
     * Write Line Protocol record into specified bucket.
     *
     * @param bucket       specifies the destination bucket for writes
     * @param organization specifies the destination organization for writes
     * @param precision    specifies the precision for the unix timestamps within the body line-protocol.
     *                     Available values : {@link ChronoUnit#NANOS}, {@link ChronoUnit#MICROS},
     *                     {@link ChronoUnit#MILLIS}, {@link ChronoUnit#SECONDS}.
     *                     Default value : {@link TimeUnit#NANOSECONDS}.
     * @param record       specifies the record in InfluxDB Line Protocol.
     *                     The {@code record} is considered as one batch unit.
     */
    void writeRecord(@Nonnull final String bucket,
                     @Nonnull final String organization,
                     @Nonnull final ChronoUnit precision,
                     @Nonnull final Maybe<String> record);


    /**
     * Write Line Protocol records into specified bucket.
     *
     * @param bucket       specifies the destination bucket for writes
     * @param organization specifies the destination organization for writes
     * @param precision    specifies the precision for the unix timestamps within the body line-protocol.
     *                     Available values : {@link ChronoUnit#NANOS}, {@link ChronoUnit#MICROS},
     *                     {@link ChronoUnit#MILLIS}, {@link ChronoUnit#SECONDS}.
     *                     Default value : {@link TimeUnit#NANOSECONDS}.
     * @param records      specifies the records in InfluxDB Line Protocol
     */
    void writeRecords(@Nonnull final String bucket,
                      @Nonnull final String organization,
                      @Nonnull final ChronoUnit precision,
                      @Nonnull final Flowable<String> records);

    /**
     * Write Line Protocol records into specified bucket.
     *
     * @param bucket       specifies the destination bucket for writes
     * @param organization specifies the destination organization for writes
     * @param precision    specifies the precision for the unix timestamps within the body line-protocol.
     *                     Available values : {@link ChronoUnit#NANOS}, {@link ChronoUnit#MICROS},
     *                     {@link ChronoUnit#MILLIS}, {@link ChronoUnit#SECONDS}.
     *                     Default value : {@link TimeUnit#NANOSECONDS}.
     * @param records      specifies the records in InfluxDB Line Protocol
     */
    void writeRecords(@Nonnull final String bucket,
                      @Nonnull final String organization,
                      @Nonnull final ChronoUnit precision,
                      @Nonnull final Publisher<String> records);

    /**
     * Write Data point into specified bucket.
     *
     * @param bucket       specifies the destination bucket for writes
     * @param organization specifies the destination organization for writes
     * @param point        specifies the Data point to write into bucket
     */
    void writePoint(@Nonnull final String bucket,
                    @Nonnull final String organization,
                    @Nonnull final Maybe<Point> point);


    /**
     * Write Data points into specified bucket.
     *
     * @param bucket       specifies the destination bucket ID for writes
     * @param organization specifies the destination organization ID for writes
     * @param points       specifies the Data points to write into bucket
     */
    void writePoints(@Nonnull final String bucket,
                     @Nonnull final String organization,
                     @Nonnull final Flowable<Point> points);

    /**
     * Write Data points into specified bucket.
     *
     * @param bucket       specifies the destination bucket ID for writes
     * @param organization specifies the destination organization ID for writes
     * @param points       specifies the Data points to write into bucket
     */
    void writePoints(@Nonnull final String bucket,
                     @Nonnull final String organization,
                     @Nonnull final Publisher<Point> points);


    /**
     * Write Measurement into specified bucket.
     *
     * @param bucket       specifies the destination bucket for writes
     * @param organization specifies the destination organization for writes
     * @param precision    specifies the precision for the unix timestamps within the body line-protocol.
     *                     Available values : {@link ChronoUnit#NANOS}, {@link ChronoUnit#MICROS},
     *                     {@link ChronoUnit#MILLIS}, {@link ChronoUnit#SECONDS}.
     *                     Default value : {@link TimeUnit#NANOSECONDS}.
     * @param measurement  specifies the Measurement to write into bucket
     * @param <M>          type of measurement
     */
    <M> void writeMeasurement(@Nonnull final String bucket,
                              @Nonnull final String organization,
                              @Nonnull final ChronoUnit precision,
                              @Nonnull final Maybe<M> measurement);


    /**
     * Write Measurements into specified bucket.
     *
     * @param bucket       specifies the destination bucket for writes
     * @param organization specifies the destination organization for writes
     * @param precision    specifies the precision for the unix timestamps within the body line-protocol.
     *                     Available values : {@link ChronoUnit#NANOS}, {@link ChronoUnit#MICROS},
     *                     {@link ChronoUnit#MILLIS}, {@link ChronoUnit#SECONDS}.
     *                     Default value : {@link TimeUnit#NANOSECONDS}.
     * @param measurements specifies the Measurements to write into bucket
     * @param <M>          type of measurement
     */
    <M> void writeMeasurements(@Nonnull final String bucket,
                               @Nonnull final String organization,
                               @Nonnull final ChronoUnit precision,
                               @Nonnull final Flowable<M> measurements);

    /**
     * Write Measurements into specified bucket.
     *
     * @param bucket       specifies the destination bucket for writes
     * @param organization specifies the destination organization for writes
     * @param precision    specifies the precision for the unix timestamps within the body line-protocol.
     *                     Available values : {@link ChronoUnit#NANOS}, {@link ChronoUnit#MICROS},
     *                     {@link ChronoUnit#MILLIS}, {@link ChronoUnit#SECONDS}.
     *                     Default value : {@link TimeUnit#NANOSECONDS}.
     * @param measurements specifies the Measurements to write into bucket
     * @param <M>          type of measurement
     */
    <M> void writeMeasurements(@Nonnull final String bucket,
                               @Nonnull final String organization,
                               @Nonnull final ChronoUnit precision,
                               @Nonnull final Publisher<M> measurements);

    /**
     * Listen the events produced by {@link WriteClient}.
     * <p>
     * The {@link WriteClient} produces: {@link org.influxdata.platform.write.event.WriteSuccessEvent},
     * {@link org.influxdata.platform.write.event.BackpressureEvent} and
     * {@link org.influxdata.platform.write.event.WriteErrorEvent}.
     *
     * @param eventType type of event to listen
     * @param <T>       type of event to listen
     * @return lister for {@code eventType} events
     */
    @Nonnull
    <T extends AbstractWriteEvent> Observable<T> listenEvents(@Nonnull final Class<T> eventType);

    /**
     * Close threads for asynchronous batch writing.
     */
    void close();
}