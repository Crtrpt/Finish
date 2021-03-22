import { addMessages,register, init, getLocaleFromNavigator } from 'svelte-i18n';

import en from './i18n/en_us.json.json';

addMessages('en', en);

console.log(en);


// //异步加载语言包
// register('en', () => import('./en_us.json'));
// register('zh', () => import('./zh_cn.json'));

console.log("多语言包")
init({
  fallbackLocale: 'en',
  initialLocale: getLocaleFromNavigator(),
});