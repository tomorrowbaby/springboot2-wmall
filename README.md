# springboot2-wmall
# 微服务WarmCool商城后台管理系统

开发计划：由vue做前端开发！ Jquery做后台管理系统 （ps：前端过于业余所以绝大数是修改！）

#完全前后端分离开发

#前端参考于ＸＭａｌｌ商城（已付费）　感谢Ｘｍａｌｌ作者大佬！

项目后台地址：http://119.3.182.107/static/ 初步发布，还存在很多问题(ES因为服务器内存小，无法启动)

**后台技术**
          2020.3.15日更新
![iamge](http://q6g3wzhaj.bkt.clouddn.com/%E6%8A%80%E6%9C%AF.jpg)

#WarmCool系统后台系统模块设计图（目前只进行到单体版）
    
![iamge](http://q6g3wzhaj.bkt.clouddn.com/%E5%95%86%E5%9F%8E%E6%9E%B6%E6%9E%84%E5%9B%BE%20%284%29.png)    

开发日志

２０１９.１１.２９　第一次　上传

      数据库
      数据库设计基本完成
      
      图片服务器
      图片服务器由虚拟机搭建Nginx+docker+ftp模拟实现完成（安全性未知）！
    
      用户基本模块　
            基本增删改查＋分页
            bug: 未测试出bug 
      商品基本模块　
             基本增删改查　＋　分页　＋　图片上传(webupload)　＋ 文本编辑图片上传（ckeditor）
             bug : 文本编辑器多图片上传，无法上传(能力不足，未解决！)
      
2019.12.27
      
      短信API接入完成，通过测试号可以给接受到的短信进行一个验证
2019.12.29
      
      短信注册并登陆功能开发完成     
      单点登陆：Redis Token   
      
2020.2.25

       发送短信验证码SDK的工具重新封装
       订单后台模块开发完成                
       对图片上传进行七牛云SDK的开发
       
2020.3.1 

        物流信息基本模块开发完成
        
2020.3.3
            
        前台板块模块开发完成
        
2020.3.5
        
        后台登陆验证开发完成
        图形验证码开发完成
        
2020.3.8
        
        ES集成完成 由于ES版本为7.6.0，所以对SpringBoot从2.1.6升级到2.2.0
        并且对其他依赖进行了版本升级
     
2020.3.10

        索引模块ES,词典开发完成       
2020.3.14

        Security集成简单开发完成
        进行简单的身份验证，权限验证未开发

2020.3.18

        项目初步发布 - 问题很多，待解决! 
       
