

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home page</title>
</head>
<body>
<table border="1">
    <#list allpermission as nameProject,repo>
        <tr>
            <th>${nameProject}</th>
        <#if nameProject?is_first >
            <th></th>
        </#if>
            <#if nameProject?is_first >
                <#list allUsers as users>
                    <th>${users}</th>
                </#list>
            </#if>

    </tr>
        <#list repo as nameRepo, resultPermission>
        <tr>

            <th style="visibility: hidden"></th>
            <th>${nameRepo}</th>
                <#list resultPermission as result>
            <th>${result}</th>
                </#list>
        </tr>
        </#list>
    </#list>
</table>
</body>
</html>

