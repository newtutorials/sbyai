import plotly.express as px

df = px.data.iris()
fig = px.scatter(df, x="sepal_length", y="sepal_width", color="species", color_discrete_sequence=['red', 'green', 'blue'])
fig.show()
