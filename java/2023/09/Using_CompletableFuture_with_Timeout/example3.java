CompletableFuture<String> fallbackFuture = future.handle((result, throwable) -> {
    if (throwable instanceof TimeoutException) {
        // Handle timeout exception here
        return fallbackResult;
    } else {
        // Handle successful result here
        return result;
    }
});
