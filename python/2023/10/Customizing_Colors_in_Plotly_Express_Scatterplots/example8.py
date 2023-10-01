fig = px.scatter(df, x="weight", y="horsepower", color="mpg", color_continuous_scale="Viridis", color_continuous_midpoint=10)
fig.show()
