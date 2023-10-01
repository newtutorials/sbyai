CompletableFuture<String> fallbackFuture = future.exceptionally(throwable -> {
    // Handle timeout exception here
    return fallbackResult;
});
