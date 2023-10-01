import plotly.graph_objects as go

fig = go.Figure(data=go.Bar(
    x=['Apples', 'Oranges', 'Bananas'],
    y=[5, 3, 10],
    marker_color='blue'
))
fig.show()
