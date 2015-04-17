EasyShop-Server(网上便利店) 2.0.1 中文版

-------------------
更新日志
- 20150417 修改bootstrap.min.css,theme.css,navbar.jsp导航条进行优化
- 20150416 程序汉化中文版 (未完成)
- 20150415 获取源码部署成功




项目描述:
-------------------

获取源码

$ git clone git://github.com/1047210553/EasyShop-Server.git

If this is your first time using Github, review http://help.github.com to learn the basics.

You can also download the zip file containing the code from https://github.com/1047210553/EasyShop-Server.git

功能列表

- 购物车 Shopping cart
- 分类 Catalogue
- 查找 Search
- 结算 Checkout
- 管理 Administration

编译代码:
-------------------	
From the command line with Maven installed:

	$ cd shopizer
	$ mvn clean install
	


copy sm-shop/target/sm-shop.war to tomcat or any other application server deployment dir

Increase heap space to 1024 m or at least 512 m

### 环境配置:


If you are using Tomcat, edit catalina.bat for windows users or catalina.sh for linux / Mac users

	in Windows
	set JAVA_OPTS="-Xms1024m -Xmx1024m -XX:MaxPermSize=256m" 
	
	in Linux / Mac
	export JAVA_OPTS="-Xms1024m -Xmx1024m -XX:MaxPermSize=256m" 


### 运行程序:


Access the deployed web application at: http://localhost:8080/sm-shop/shop

Acces the admin section at: http://localhost:8080/sm-shop/admin

#####username : admin
#####password : password

The instructions above will let you run the application with default settings and configurations.
Please read the instructions on how to connect to MySQL, configure an email server and configure other subsystems

### 帮助文档:

Documentation available from the wiki <https://github.com/shopizer-ecommerce/shopizer/wiki>

More documentation is available on shopizer web site here <http://www.shopizer.com>
