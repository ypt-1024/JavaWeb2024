<script setup type="module">
import{useRoute} from 'vue-router'
import { onUpdated,ref } from 'vue';
// 获取当前的route对象
let route =useRoute()
let languageId = ref(0)
let languageName = ref('')

//  借助更新时生命周期,将数据更新进入响应式对象
// onUpdated (()=>{
  // 获取对象中的参数(通过query获取参数,此时参数是key-value形式的)
  languageId.value=route.query.id
  languageName.value=route.query.language

// })

</script>

<template>
  <div>
    <h1>ShowDetail2页面</h1>
    <h3>编号{{route.query.id}}:{{route.query.language}}是世界上最好的语言</h3>
    <h3>编号{{languageId}}:{{languageName}}是世界上最好的语言</h3>
  </div>
</template>

<style scoped>
</style>
