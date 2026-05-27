package me.sudohippie.throttle.strategy.bucket;

import me.sudohippie.throttle.strategy.ThrottleStrategy;
import me.sudohippie.throttle.util.Assert;
import java.util.concurrent.TimeUnit;

/**
 * Abstract class representing a token bucket strategy.
 *
 * Using this strategy, throttling is enforced via the existence of tokens in a bucket.
 *
 * Raghav Sidhanti
 * 9/25/13
 */
public abstract class TokenBucketStrategy extends ThrottleStrategy {

    protected final long bucketTokenCapacity;

    protected final long refillInterval;

    // number of tokens in the bucket
    protected long tokens = 0;

    protected long nextRefillTime = 0;

    protected TokenBucketStrategy(long bucketTokenCapacity, long refillInterval, TimeUnit refillIntervalTimeUnit) {
        Assert.isTrue(bucketTokenCapacity >= 0, "Bucket token capacity can not be negative");
        Assert.isTrue(refillInterval >= 0, "Bucket refill interval can not be negative");
        this.bucketTokenCapacity = bucketTokenCapacity;
        this.refillInterval = refillIntervalTimeUnit.toMillis(refillInterval);
    }

    @Override
    public synchronized boolean isThrottled() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public synchronized boolean isThrottled(long n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long getCapacity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public synchronized long getCurrentTokenCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public synchronized long timeToRelease(long n, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract void updateTokens();
}
