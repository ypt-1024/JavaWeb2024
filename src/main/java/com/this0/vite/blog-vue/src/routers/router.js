// 导入路由创建的相关方法
import {createRouter,createWebHashHistory} from 'vue-router'

// 导入vue组件

import ShowDetail from '../components/ShowDetail.vue'
import ShowDetail2 from '../components/ShowDetail2.vue'

// 创建路由对象,声明路由规则
const router = createRouter({
    history: createWebHashHistory(),
    routes:[

        {
            /* 此处:id  :language作为路径的占位符,传到视图页面 */
            path:'/showDetail/:id/:language',
            /* 第二步，路由传参时,根据该名字showDetail找到该路由,跳转并带数据过去 */
            name:'showDetail',
            components:{
                //格式    路由的name：路由视图
                showDetailView:ShowDetail
            }
        },
        {
            path:'/showDetail2',
            components:{
                showDetailView2:ShowDetail2
            }
        },
    ]

})

//全局前置路由守卫
router.beforeEach( (to,from,next) => {

    //to 是目标地包装对象  .path属性可以获取地址
    //from 是来源地包装对象 .path属性可以获取地址

    //next() 放行,直接到达目标组件
    //next('/地址')可以转发到其他地址,到达目标组件前会再次经过前置路由守卫


    //需要判断，注意避免无限重定向
    if(to.path == '/showDetail/1/JAVA'){
        next()
    }else{
        next('/showDetail/1/JAVA')
    }

} )

//全局后置路由守卫
router.afterEach((to, from) => {
    console.log(`路由从 ${from.path} 到 ${to.path}`);
});


// 对外暴露路由对象
export default router;