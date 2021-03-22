import { register, init, getLocaleFromNavigator } from 'svelte-i18n';

//异步加载语言包
register('en', () => import('./en_us.json'));
register('zh', () => import('./zh_cn.json'));

init({
  fallbackLocale: 'en',
  initialLocale: getLocaleFromNavigator(),
});