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
                //格式路由的name：路由视图
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

// 对外暴露路由对象
export default router;