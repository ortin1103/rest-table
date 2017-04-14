

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home page</title>
</head>
<body>
<table border="1">
    <#list allpermission as Project>
        <tr>
            <th>${Project.name}</th>
        <#if Project?is_first >
            <th></th>
        </#if>
            <#if Project?is_first >
                <#list allUsers as users>
                    <th>${users}</th>
                </#list>
            </#if>

    </tr>
        <#list Project.repos as repo>
        <tr>

            <th style="visibility: hidden"></th>
            <th>${repo.name}</th>
                <#list repo.equailsUsersPermissions as result>
            <th>${result}</th>
                </#list>
        </tr>
        </#list>
    </#list>
</table>
</body>
</html>

