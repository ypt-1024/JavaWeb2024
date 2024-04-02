<script setup type="module">
let msg = 'hello vue3'
let getMsg = () => {
  return msg
}
let age = 19
let bee = '蜜 蜂'
let redMsg = "<font color='red'>msg</font>"
let greenMsg = `<font color=\'green\'>${msg}</font>`
</script>

<template>
  <div>
    <span v-text="msg"></span> <br />
    <span v-text="redMsg"></span> <br />
    <span v-text="getMsg()"></span> <br />
    <span v-text="age > 18 ? '成年' : '未成年'"></span> <br />
    <span v-text="bee.split(' ').reverse().join('-')"></span> <br />
    <span v-html="msg"></span> <br />
    <span v-html="redMsg"></span> <br />
    <span v-html="greenMsg"></span> <br />
    <span v-html="`<font color='green'>${msg}</font>`"></span> <br />
  </div>
</template>

<style scoped></style>
