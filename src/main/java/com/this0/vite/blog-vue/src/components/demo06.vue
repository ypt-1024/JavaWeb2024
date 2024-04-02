<script type="module" setup>
import { ref } from 'vue'
let awesome = ref(true)
</script>

<template>
  <div>
    <h1 id="ha" v-show="awesome">Vue is awesome!</h1>
    <h1 id="hb" v-if="awesome">Vue is awesome!</h1>
    <h1 id="hc" v-else>Oh no 😢</h1>
    <button @click="awesome = !awesome">Toggle</button>
  </div>
</template>

<style scoped></style>
