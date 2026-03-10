# Look4Sat: Satellite tracker


# [cf 反代加速worker.js](/wty_add_whitelist_worker.js)
### 将卫星数据更新添加了代理，方便访问

### 修改了包名com.rtbishop_wty.look4sat


helps for wty(PowerShell)
1. 设置 JAVA_HOME（根目录，不要带 bin）
$env:JAVA_HOME = "D:\Java\jdk-17"

2. 将 JDK 17 的 bin 目录放到 PATH 最前面
$env:PATH = "$env:JAVA_HOME\bin;$env:PATH"

验证切换是否成功（输出应为 Java 17 版本）
java -version


./gradlew assembleRelease