import json
import pathlib

file = open("notes.json")
data = json.load(file)

# --------

for session in data:
    for lesson in data[session]:
        for table in data[session][lesson]:
            output = "Keyword;Description\n"
            for keyword in data[session][lesson][table]:
                output += keyword + ";" + data[session][lesson][table][keyword] + "\n"
            open(session + "/" + lesson + "/" + table + ".csv", "w").write(output)
            output = ""

file.close()