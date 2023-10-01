fig = px.scatter(df, x="weight", y="horsepower", color="origin", color_discrete_sequence=["red", "green", "blue"])
fig.show()
