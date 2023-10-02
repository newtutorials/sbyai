Flux<Integer> numbers = Flux.just(1, 2, 3)
        .concatWith(Mono.error(new RuntimeException("Something went wrong")))
        .onErrorReturn(0);

numbers.subscribe(System.out::println);
