package me.sudohippie.throttle.strategy.bucket;

import java.util.concurrent.TimeUnit;

/**
 * StepUpLeakyTokenBucketStrategy is concrete representation of {@link LeakyTokenBucketStrategy}.
 *
 * This strategy is synonymous to an empty bucket being filled with some substance (here tokens) over time.
 * Here, at the beginning of every refill interval the bucket is emptied. The bucket is then gradually filled
 * with tokens and rate is defined by the input parameters stepTokens and stepInterval.
 *
 * Raghav Sidhanti
 * 9/25/13
 */
public class StepUpLeakyTokenBucketStrategy extends LeakyTokenBucketStrategy {

    private long lastActivityTime;

    /**
     * Constructor to build a StepUpLeakyTokenBucketStrategy.
     *
     * @param maxTokens The maximum tokens this bucket can hold.
     * @param refillInterval The interval at which the bucket must be emptied.
     * @param refillIntervalTimeUnit {@link java.util.concurrent.TimeUnit} class representing unit of time of refill interval
     * @param stepTokens The number of tokens added to the bucket at every step interval.
     * @param stepInterval The interval at which tokens are added.
     * @param stepIntervalTimeUnit {@link java.util.concurrent.TimeUnit} class representing unit of time of step interval
     */
    public StepUpLeakyTokenBucketStrategy(long maxTokens, long refillInterval, TimeUnit refillIntervalTimeUnit, long stepTokens, long stepInterval, TimeUnit stepIntervalTimeUnit) {
        super(maxTokens, refillInterval, refillIntervalTimeUnit, stepTokens, stepInterval, stepIntervalTimeUnit);
    }

    @Override
    protected void updateTokens() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
