import plotly.graph_objects as go

z = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

fig = go.Figure(data=go.Heatmap(
    z=z,
    colorscale='Viridis'  # Color scale ranging from light to dark shades of blue
))
fig.show()
