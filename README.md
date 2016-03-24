# spring_mvc
# LoftCam SDK API
## �汾��Ϣ
- ����ʱ�䣺2016-03-34

- �����ߣ�hzwangfei2014@corp.netease.com

- �汾��0.0.1

## ���ݿ���Ϣ

�������������������ݿ⣬���ݿ�������Ϣ���£�
```
database.driverClassName=com.mysql.jdbc.Driver
database.url=jdbc\:mysql\://10.120.153.57\:3306/loftcam
database.username=loftcam
database.password=vj~xsJZVa
```

���ݿ��б�����Ϊ 'sdk_log'����ṹ���£�
```
CREATE TABLE `sdk_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '���',
  `phone_name` varchar(100) DEFAULT NULL COMMENT '�ֻ�����',
  `phone_imei` varchar(100) DEFAULT NULL COMMENT '�ֻ�ʶ����',
  `phone_sys` varchar(100) DEFAULT NULL COMMENT '�ֻ�ϵͳ���汾',
  `sdk_use_time` bigint(20) unsigned DEFAULT '1' COMMENT 'SDKʹ�ô���',
  `sdk_version` varchar(100) DEFAULT NULL COMMENT 'SDK�汾',
  `first_use` timestamp NULL DEFAULT NULL COMMENT '����ʹ��ʱ��',
  `last_use` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '���һ��ʹ��ʱ��',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```

## �ӿ�˵��
#### SDK LOG:
```
/api/sdk/log
```
#### Prarm:
| ��������     | ����    | ˵��    |
| :--------  | ------:| :------:|
| phoneName  | String | �ֻ����� |
| phoneImei  | String | ʵ��ʶ����| 
| phoneSys   | String | �ֻ�ϵͳ  | 
| sdkVersion | String | SDK �汾 | 

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
