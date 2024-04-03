<script type="module" setup>

//引入模块
import { reactive,ref} from 'vue'
let hbs = ref([]); //装爱好的值
let user = reactive({username:null,password:null,introduce:null,pro:null})
function login(){
  alert(hbs.value);
  alert(JSON.stringify(user));
}
function clearx(){
  //user = {};// 这中写法会将数据变成非响应的,应该是user.username=""
  user.username=''
  user.password=''
  user.introduce=''
  user.pro=''
  hbs.value.splice(0,hbs.value.length);;
}
</script>

<template>
  <div>
    账号： <input type="text" placeholder="请输入账号！" v-model="user.username"> <br>
    密码： <input type="text" placeholder="请输入账号！" v-model="user.password"> <br>
    爱好：
    吃 <input type="checkbox" name="hbs" v-model="hbs" value="吃">
    喝 <input type="checkbox" name="hbs" v-model="hbs" value="喝">
    玩 <input type="checkbox" name="hbs" v-model="hbs" value="玩">
    乐 <input type="checkbox" name="hbs" v-model="hbs" value="乐">
    <br>
    简介:<textarea v-model="user.introduce"></textarea>
    <br>
    籍贯:
    <select v-model="user.pro">
      <option value="1">黑</option>
      <option value="2">吉</option>
      <option value="3">辽</option>
      <option value="4">京</option>
      <option value="5">津</option>
      <option value="6">冀</option>
    </select>
    <br>
    <button @click="login()">登录</button>
    <button @click="clearx()">重置</button>
    <hr>
    显示爱好:{{ hbs }}
    <hr>
    显示用户信息:{{ user }}
  </div>
</template>

<style scoped>
</style>
