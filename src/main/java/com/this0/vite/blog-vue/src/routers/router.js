// 导入路由创建的相关方法
import {createRouter, createWebHashHistory} from 'vue-router'

// 导入vue组件
import Home from '../components/Home.vue'
import List from '../components/List.vue'
import Add from '../components/Add.vue'
import Update from '../components/Update.vue'

// 创建路由对象,声明路由规则
const router = createRouter({

  //创建路由的历史记录对象。
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',   //路由根路径

      components: {

        default: Add,   // 默认路由视图,也就是:<router-view></router-view>
        homeView: Home, //在默认页面展示的路由，多选，格式：路由名：视图名
        listView: List,
      },
    },
    {
      path: '/home',
      components: {
        homeView: Home,
      },
    }, {
      path: '/list',
      components: {
        listView: List,
      },
    },
    {
      path: '/add',
      components: {
        addView: Add,
      },
    },
    {
      path: '/update',
      components: {
        updateView: Update,
      },
    },
  ],
})

// 对外暴露路由对象
export default router
