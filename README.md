# spring_mvc
# LoftCam SDK API
## 版本信息
- 创建时间：2016-03-34

- 创建者：hzwangfei2014@corp.netease.com

- 版本：0.0.1

## 数据库信息

与其他服务公用线上数据库，数据库连接信息如下：
```
database.driverClassName=com.mysql.jdbc.Driver
database.url=jdbc\:mysql\://10.120.153.57\:3306/loftcam
database.username=loftcam
database.password=vj~xsJZVa
```

数据库中表名称为 'sdk_log'，表结构如下：
```
CREATE TABLE `sdk_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `phone_name` varchar(100) DEFAULT NULL COMMENT '手机名称',
  `phone_imei` varchar(100) DEFAULT NULL COMMENT '手机识别码',
  `phone_sys` varchar(100) DEFAULT NULL COMMENT '手机系统及版本',
  `sdk_use_time` bigint(20) unsigned DEFAULT '1' COMMENT 'SDK使用次数',
  `sdk_version` varchar(100) DEFAULT NULL COMMENT 'SDK版本',
  `first_use` timestamp NULL DEFAULT NULL COMMENT '初次使用时间',
  `last_use` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次使用时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```

## 接口说明
#### SDK LOG:
```
/api/sdk/log
```
#### Prarm:
| 参数名称     | 类型    | 说明    |
| :--------  | ------:| :------:|
| phoneName  | String | 手机名称 |
| phoneImei  | String | 实际识别码| 
| phoneSys   | String | 手机系统  | 
| sdkVersion | String | SDK 版本 | 

### Return
> error:log add wrong.

> ok:log add success.

#### Server Live:

```
/live
```
#### Return
> The server is active!

## Feedback & Bug Report
 - PoPo:<hzwangfei2014@corp.netease.com>
