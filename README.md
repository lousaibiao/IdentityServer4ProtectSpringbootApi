# IdentityServer4ProtectSpringbootApi
Use IdentityServer4 to Protect Springboot Api

用IdentityServer4作为一个AuthorizationServer，然后Springboot作为一个ResourceApi，也就是需要保护的API服务。用户在IdServer获取token之后，可以使用这个token去调用Springboot的API。

这里仅仅是一个Springboot的Api服务。

`http://localhost:5588`为IdentityServer的地址。
`/getCustomer` 为需要访问的API地址。
