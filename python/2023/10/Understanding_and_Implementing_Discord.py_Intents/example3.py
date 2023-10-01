@bot.event
async def on_ready():
    print(f'Bot is ready as {bot.user.name}')

@bot.event
async def on_member_join(member):
    print(f'{member.name} has joined the server')

@bot.event
async def on_message(message):
    if message.author == bot.user:
        return
    await bot.process_commands(message)
