# Generate additional random data
values2 = np.random.randint(low=1, high=100, size=10)
cumulative_totals2 = np.cumsum(sorted(values2, reverse=True))

fig.add_trace(go.Bar(
    x=np.arange(1, len(values2)+1),
    y=values2,
    name='Values 2',
    marker_color='rgba(0, 128, 0, 0.5)',
    text=values2,
    textposition='outside'
))

fig.add_trace(go.Scatter(
    x=np.arange(1, len(values2)+1),
    y=cumulative_totals2,
    name='Cumulative Total 2',
    mode='lines+markers',
    marker_color='rgba(128, 0, 0, 0.5)',
    line=dict(color='rgba(128, 0, 0, 0.5)', width=2),
    text=cumulative_totals2,
    textposition='top center'
))

fig.update_layout(
    title='Pareto Chart with Overlayed Plots',
    xaxis=dict(title='Categories'),
    yaxis=dict(title='Values')
)

fig.show()
