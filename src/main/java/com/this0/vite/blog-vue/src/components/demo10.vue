<script type="module" setup>
//引入模块
import { ref,reactive,watch} from 'vue'

let firstname=ref('')
let lastname=reactive({name:''})
let fullname=ref('')

//监听一个ref响应式数据
watch(firstname,(newValue,oldValue)=>{
  console.log(`${oldValue}变为${newValue}`)
  fullname.value=firstname.value+lastname.name
})
//监听reactive响应式数据的指定属性
watch(()=>lastname.name,(newValue,oldValue)=>{
  console.log(`${oldValue}变为${newValue}`)
  fullname.value=firstname.value+lastname.name
})
//监听reactive响应式数据的所有属性(深度监视,一般不推荐)
//deep:true 深度监视
//immediate:true 深度监视在进入页面时立即执行一次
watch(()=>lastname,(newValue,oldValue)=>{
  // 此时的newValue和oldValue一样,都是lastname
  console.log(newValue)
  console.log(oldValue)
  fullname.value=firstname.value+lastname.name
},{deep:true,immediate:false})
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