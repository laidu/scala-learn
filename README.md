# scala-learn

## 使用国内sbt源 加速依赖下载

    vim ~/.sbt/repositories
    
编辑文件：

    [repositories]
      local
      aliyun: http://maven.aliyun.com/nexus/content/groups/public/
      typesafe-ivy-releases: https://repo.typesafe.com/typesafe/ivy-releases/, [organization]/[module]/[revision]/[type]s/[artifact](-[classifier]).[ext], bootOnly
