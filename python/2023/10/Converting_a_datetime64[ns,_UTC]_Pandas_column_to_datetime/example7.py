df['date'] = df['date'].apply(lambda x: x.tz_convert(None))
