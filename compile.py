import json
import pathlib

file = open("notes.json")
data = json.load(file)

# --------

for session in data:
    pathlib.Path(session).mkdir(parents=True, exist_ok=True) 
    for lesson in data[session]:
        output = ""
        output += "### " + lesson + "\n\n<br>\n\n"
        for table in data[session][lesson]:
            output += table + "\n\n"
            output += "|Keyword|Note|\n|:-|:-|\n"
            for keyword in data[session][lesson][table]:
                output += "|" + keyword + "|" + data[session][lesson][table][keyword] + "|" + "\n"
            output += "\n<br>\n\n"
        open(session + "/" + lesson + ".md", "w").write(output)
        output = ""

# --------

initial = '''<!DOCTYPE html><html lang="en"><head><meta charset="UTF-8"><meta http-equiv="X-UA-Compatible" content="IE=edge"><meta name="viewport" content="width=device-width, initial-scale=1.0"><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous"><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script><script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script></head><body style="overflow-y:scroll"><div class="container py-5 d-flex flex-column gap-3"><table class="table table-bordered table-striped"><thead class="position-sticky sticky-top bg-white"><tr><th style="width:15%"><select class="form-select" aria-label="Default select example"><option selected>Session</option></select></th><th style="width:15%"><select class="form-select" aria-label="Default select example"><option selected>Topic</option></select></th><th style="width:20%"><input class="form-control position-sticky sticky-top" id="query" type="text" placeholder="Keyword"></th><th><input class="form-control position-sticky sticky-top" id="query" type="text" placeholder="Note"></th></tr></thead><tbody id="table">'''

remainder = '''</tbody></table></div><script>;$(document).ready(function(){$('#query').on('keyup',function(){var t=$(this).val().toLowerCase();$('#table tr').filter(function(){$(this).toggle($(this).text().toLowerCase().indexOf(t)>-1)})})});</script></body></html>'''

html = initial
for session in data:
    for lesson in data[session]:
        for table in data[session][lesson]:
            for keyword in data[session][lesson][table]:
                html += "<tr><td>" + session + "</td><td>" + table + "</td><td>" + keyword + "</td><td>" + data[session][lesson][table][keyword] + "</td></tr>"

html += remainder
open("index.html", "w").write(html)

# --------

file.close()