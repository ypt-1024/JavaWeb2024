<script setup type="module">
    import{useRoute} from 'vue-router'
    import { onUpdated,ref } from 'vue';
    // 获取当前的route对象
    let route =useRoute()
    let languageId = ref(0)
    let languageName = ref('')
    //  借助更新时生命周期,将数据更新进入响应式对象
    // onUpdated (()=>{
        // 第三步，获取路由对象中的参数，通过route.params.xx的方式获取，本身就是响应式数据
        languageId.value=route.params.id
        languageName.value=route.params.language
        console.log(languageId.value)
        console.log(languageName.value)
    // })

</script>

<template>
    <div>
        <h1>ShowDetail页面</h1>
        <h3>编号{{route.params.id}}:{{route.params.language}}是世界上最好的语言</h3>
        <h3>编号{{languageId}}:{{languageName}}是世界上最好的语言</h3>
    </div>
</template>

<style scoped>
</style>
