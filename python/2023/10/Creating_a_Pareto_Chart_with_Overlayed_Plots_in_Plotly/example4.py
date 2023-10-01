fig = go.Figure()

fig.add_trace(go.Bar(
    x=np.arange(1, len(values)+1),
    y=values,
    name='Values',
    marker_color='rgba(0, 0, 255, 0.5)',
    text=values,
    textposition='outside'
))

fig.add_trace(go.Scatter(
    x=np.arange(1, len(values)+1),
    y=cumulative_totals,
    name='Cumulative Total',
    mode='lines+markers',
    marker_color='rgba(255, 0, 0, 0.5)',
    line=dict(color='rgba(255, 0, 0, 0.5)', width=2),
    text=cumulative_totals,
    textposition='top center'
))

fig.update_layout(
    title='Pareto Chart',
    xaxis=dict(title='Categories'),
    yaxis=dict(title='Values')
)

fig.show()
