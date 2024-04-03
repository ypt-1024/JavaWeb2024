<script type="module" setup>
//引入模块
import { ref,reactive,watch, watchEffect} from 'vue'

let firstname=ref('')
let lastname=reactive({name:''})
let fullname=ref('')

//监听所有响应式数据
watchEffect(()=>{
  //直接在内部使用监听属性即可！不用外部声明
  //也不需要，即时回调设置！默认初始化就加载！
  console.log(firstname.value)
  console.log(lastname.name)
  fullname.value=`${firstname.value}${lastname.name}`
})
</script>

<template>
  <div>
    全名:{{fullname}} <br>
    姓氏:<input type="text" v-model="firstname"> <br>
    名字:<input type="text" v-model="lastname.name" > <br>
  </div>
</template>

<style scoped>
</style>