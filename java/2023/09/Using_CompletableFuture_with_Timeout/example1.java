CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    // Perform a long-running computation here
    return result;
}).orTimeout(5, TimeUnit.SECONDS);
