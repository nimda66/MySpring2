<!DOCTYPE html>
<html lang="de">
    <head>
        <title>Standards</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
    <h1>List of Standards</h1>

        <table>
            <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Dok Nr</th>
                <th>Issue Date</th>
                <th>Working Grem</th>
                <th>Link</th>
            </tr>

            <#list standards as standard>
                <tr>
                    <td>${standard.id}</td>
                    <td>${standard.title}</td>
                    <td>${standard.dokNr}</td>
                    <td>${standard.issueDate}</td>
                    <td>${standard.workingGrem}</td>
                    <td><a href="https://din.de?gremId=${standard.workingGremId}" target="_blank" rel="noopener noreferrer">goto document</a></td>
                </tr>
            </#list>
        </table>
    </body>
</html>
