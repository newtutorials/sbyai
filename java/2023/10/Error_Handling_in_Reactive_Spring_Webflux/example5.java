Flux<Integer> numbers = Flux.just(1, 2, 3)
        .concatWith(Mono.error(new RuntimeException("Something went wrong")))
        .onErrorResume(ex -> Flux.just(4, 5, 6));

numbers.subscribe(System.out::println);
