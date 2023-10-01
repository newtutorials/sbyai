np.random.seed(42)
values = np.random.randint(low=1, high=100, size=10)
cumulative_totals = np.cumsum(sorted(values, reverse=True))
