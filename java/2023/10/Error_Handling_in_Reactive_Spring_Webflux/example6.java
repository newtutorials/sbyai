Flux<Integer> numbers = Flux.just(1, 2, 3)
        .concatWith(Mono.error(new RuntimeException("Something went wrong")))
        .onErrorContinue((ex, obj) -> System.out.println("Error occurred, skipping element: " + obj));

numbers.subscribe(System.out::println);
