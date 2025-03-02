<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>HVAC - Free Website Template for HVAC</title>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="format-detection" content="telephone=no">
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="author" content="templatesjungle">
  <meta name="keywords" content="website template">
  <meta name="description" content="website template">

  <!--Bootstrap ================================================== -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

  <!--vendor css ================================================== -->
  <link rel="stylesheet" type="text/css" href="css/vendor.css">


  <!--Link Swiper's CSS ================================================== -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />

  <!-- Style Sheet ================================================== -->
  <link rel="stylesheet" type="text/css" href="style.css">

  <!-- Google Fonts ================================================== -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
    rel="stylesheet">
</head>
<body>
  <svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
    <symbol id="paypal" viewBox="0 0 576 512">
      <path fill="currentColor"
        d="M186.3 258.2c0 12.2-9.7 21.5-22 21.5c-9.2 0-16-5.2-16-15c0-12.2 9.5-22 21.7-22c9.3 0 16.3 5.7 16.3 15.5M80.5 209.7h-4.7c-1.5 0-3 1-3.2 2.7l-4.3 26.7l8.2-.3c11 0 19.5-1.5 21.5-14.2c2.3-13.4-6.2-14.9-17.5-14.9m284 0H360c-1.8 0-3 1-3.2 2.7l-4.2 26.7l8-.3c13 0 22-3 22-18c-.1-10.6-9.6-11.1-18.1-11.1M576 80v352c0 26.5-21.5 48-48 48H48c-26.5 0-48-21.5-48-48V80c0-26.5 21.5-48 48-48h480c26.5 0 48 21.5 48 48M128.3 215.4c0-21-16.2-28-34.7-28h-40c-2.5 0-5 2-5.2 4.7L32 294.2c-.3 2 1.2 4 3.2 4h19c2.7 0 5.2-2.9 5.5-5.7l4.5-26.6c1-7.2 13.2-4.7 18-4.7c28.6 0 46.1-17 46.1-45.8m84.2 8.8h-19c-3.8 0-4 5.5-4.2 8.2c-5.8-8.5-14.2-10-23.7-10c-24.5 0-43.2 21.5-43.2 45.2c0 19.5 12.2 32.2 31.7 32.2c9 0 20.2-4.9 26.5-11.9c-.5 1.5-1 4.7-1 6.2c0 2.3 1 4 3.2 4H200c2.7 0 5-2.9 5.5-5.7l10.2-64.3c.3-1.9-1.2-3.9-3.2-3.9m40.5 97.9l63.7-92.6c.5-.5.5-1 .5-1.7c0-1.7-1.5-3.5-3.2-3.5h-19.2c-1.7 0-3.5 1-4.5 2.5l-26.5 39l-11-37.5c-.8-2.2-3-4-5.5-4h-18.7c-1.7 0-3.2 1.8-3.2 3.5c0 1.2 19.5 56.8 21.2 62.1c-2.7 3.8-20.5 28.6-20.5 31.6c0 1.8 1.5 3.2 3.2 3.2h19.2c1.8-.1 3.5-1.1 4.5-2.6m159.3-106.7c0-21-16.2-28-34.7-28h-39.7c-2.7 0-5.2 2-5.5 4.7l-16.2 102c-.2 2 1.3 4 3.2 4h20.5c2 0 3.5-1.5 4-3.2l4.5-29c1-7.2 13.2-4.7 18-4.7c28.4 0 45.9-17 45.9-45.8m84.2 8.8h-19c-3.8 0-4 5.5-4.3 8.2c-5.5-8.5-14-10-23.7-10c-24.5 0-43.2 21.5-43.2 45.2c0 19.5 12.2 32.2 31.7 32.2c9.3 0 20.5-4.9 26.5-11.9c-.3 1.5-1 4.7-1 6.2c0 2.3 1 4 3.2 4H484c2.7 0 5-2.9 5.5-5.7l10.2-64.3c.3-1.9-1.2-3.9-3.2-3.9m47.5-33.3c0-2-1.5-3.5-3.2-3.5h-18.5c-1.5 0-3 1.2-3.2 2.7l-16.2 104l-.3.5c0 1.8 1.5 3.5 3.5 3.5h16.5c2.5 0 5-2.9 5.2-5.7L544 191.2zm-90 51.8c-12.2 0-21.7 9.7-21.7 22c0 9.7 7 15 16.2 15c12 0 21.7-9.2 21.7-21.5c.1-9.8-6.9-15.5-16.2-15.5" />
    </symbol>
    <symbol id="mastercard" viewBox="0 0 576 512">
      <path fill="currentColor"
        d="M482.9 410.3c0 6.8-4.6 11.7-11.2 11.7c-6.8 0-11.2-5.2-11.2-11.7s4.4-11.7 11.2-11.7c6.6 0 11.2 5.2 11.2 11.7m-310.8-11.7c-7.1 0-11.2 5.2-11.2 11.7S165 422 172.1 422c6.5 0 10.9-4.9 10.9-11.7c-.1-6.5-4.4-11.7-10.9-11.7m117.5-.3c-5.4 0-8.7 3.5-9.5 8.7h19.1c-.9-5.7-4.4-8.7-9.6-8.7m107.8.3c-6.8 0-10.9 5.2-10.9 11.7s4.1 11.7 10.9 11.7s11.2-4.9 11.2-11.7c0-6.5-4.4-11.7-11.2-11.7m105.9 26.1c0 .3.3.5.3 1.1c0 .3-.3.5-.3 1.1c-.3.3-.3.5-.5.8c-.3.3-.5.5-1.1.5c-.3.3-.5.3-1.1.3c-.3 0-.5 0-1.1-.3c-.3 0-.5-.3-.8-.5c-.3-.3-.5-.5-.5-.8c-.3-.5-.3-.8-.3-1.1c0-.5 0-.8.3-1.1c0-.5.3-.8.5-1.1c.3-.3.5-.3.8-.5c.5-.3.8-.3 1.1-.3c.5 0 .8 0 1.1.3c.5.3.8.3 1.1.5s.2.6.5 1.1m-2.2 1.4c.5 0 .5-.3.8-.3c.3-.3.3-.5.3-.8s0-.5-.3-.8c-.3 0-.5-.3-1.1-.3h-1.6v3.5h.8V426h.3l1.1 1.4h.8zM576 81v352c0 26.5-21.5 48-48 48H48c-26.5 0-48-21.5-48-48V81c0-26.5 21.5-48 48-48h480c26.5 0 48 21.5 48 48M64 220.6c0 76.5 62.1 138.5 138.5 138.5c27.2 0 53.9-8.2 76.5-23.1c-72.9-59.3-72.4-171.2 0-230.5c-22.6-15-49.3-23.1-76.5-23.1c-76.4-.1-138.5 62-138.5 138.2m224 108.8c70.5-55 70.2-162.2 0-217.5c-70.2 55.3-70.5 162.6 0 217.5m-142.3 76.3c0-8.7-5.7-14.4-14.7-14.7c-4.6 0-9.5 1.4-12.8 6.5c-2.4-4.1-6.5-6.5-12.2-6.5c-3.8 0-7.6 1.4-10.6 5.4V392h-8.2v36.7h8.2c0-18.9-2.5-30.2 9-30.2c10.2 0 8.2 10.2 8.2 30.2h7.9c0-18.3-2.5-30.2 9-30.2c10.2 0 8.2 10 8.2 30.2h8.2v-23zm44.9-13.7h-7.9v4.4c-2.7-3.3-6.5-5.4-11.7-5.4c-10.3 0-18.2 8.2-18.2 19.3c0 11.2 7.9 19.3 18.2 19.3c5.2 0 9-1.9 11.7-5.4v4.6h7.9zm40.5 25.6c0-15-22.9-8.2-22.9-15.2c0-5.7 11.9-4.8 18.5-1.1l3.3-6.5c-9.4-6.1-30.2-6-30.2 8.2c0 14.3 22.9 8.3 22.9 15c0 6.3-13.5 5.8-20.7.8l-3.5 6.3c11.2 7.6 32.6 6 32.6-7.5m35.4 9.3l-2.2-6.8c-3.8 2.1-12.2 4.4-12.2-4.1v-16.6h13.1V392h-13.1v-11.2h-8.2V392h-7.6v7.3h7.6V416c0 17.6 17.3 14.4 22.6 10.9m13.3-13.4h27.5c0-16.2-7.4-22.6-17.4-22.6c-10.6 0-18.2 7.9-18.2 19.3c0 20.5 22.6 23.9 33.8 14.2l-3.8-6c-7.8 6.4-19.6 5.8-21.9-4.9m59.1-21.5c-4.6-2-11.6-1.8-15.2 4.4V392h-8.2v36.7h8.2V408c0-11.6 9.5-10.1 12.8-8.4zm10.6 18.3c0-11.4 11.6-15.1 20.7-8.4l3.8-6.5c-11.6-9.1-32.7-4.1-32.7 15c0 19.8 22.4 23.8 32.7 15l-3.8-6.5c-9.2 6.5-20.7 2.6-20.7-8.6m66.7-18.3H408v4.4c-8.3-11-29.9-4.8-29.9 13.9c0 19.2 22.4 24.7 29.9 13.9v4.6h8.2zm33.7 0c-2.4-1.2-11-2.9-15.2 4.4V392h-7.9v36.7h7.9V408c0-11 9-10.3 12.8-8.4zm40.3-14.9h-7.9v19.3c-8.2-10.9-29.9-5.1-29.9 13.9c0 19.4 22.5 24.6 29.9 13.9v4.6h7.9zm7.6-75.1v4.6h.8V302h1.9v-.8h-4.6v.8zm6.6 123.8c0-.5 0-1.1-.3-1.6c-.3-.3-.5-.8-.8-1.1s-.8-.5-1.1-.8c-.5 0-1.1-.3-1.6-.3c-.3 0-.8.3-1.4.3c-.5.3-.8.5-1.1.8c-.5.3-.8.8-.8 1.1c-.3.5-.3 1.1-.3 1.6c0 .3 0 .8.3 1.4c0 .3.3.8.8 1.1c.3.3.5.5 1.1.8c.5.3 1.1.3 1.4.3c.5 0 1.1 0 1.6-.3c.3-.3.8-.5 1.1-.8s.5-.8.8-1.1c.3-.6.3-1.1.3-1.4m3.2-124.7h-1.4l-1.6 3.5l-1.6-3.5h-1.4v5.4h.8v-4.1l1.6 3.5h1.1l1.4-3.5v4.1h1.1zm4.4-80.5c0-76.2-62.1-138.3-138.5-138.3c-27.2 0-53.9 8.2-76.5 23.1c72.1 59.3 73.2 171.5 0 230.5c22.6 15 49.5 23.1 76.5 23.1c76.4.1 138.5-61.9 138.5-138.4" />
    </symbol>
    <symbol id="visa" viewBox="0 0 576 512">
      <path fill="currentColor"
        d="M470.1 231.3s7.6 37.2 9.3 45H446c3.3-8.9 16-43.5 16-43.5c-.2.3 3.3-9.1 5.3-14.9zM576 80v352c0 26.5-21.5 48-48 48H48c-26.5 0-48-21.5-48-48V80c0-26.5 21.5-48 48-48h480c26.5 0 48 21.5 48 48M152.5 331.2L215.7 176h-42.5l-39.3 106l-4.3-21.5l-14-71.4c-2.3-9.9-9.4-12.7-18.2-13.1H32.7l-.7 3.1c15.8 4 29.9 9.8 42.2 17.1l35.8 135zm94.4.2L272.1 176h-40.2l-25.1 155.4zm139.9-50.8c.2-17.7-10.6-31.2-33.7-42.3c-14.1-7.1-22.7-11.9-22.7-19.2c.2-6.6 7.3-13.4 23.1-13.4c13.1-.3 22.7 2.8 29.9 5.9l3.6 1.7l5.5-33.6c-7.9-3.1-20.5-6.6-36-6.6c-39.7 0-67.6 21.2-67.8 51.4c-.3 22.3 20 34.7 35.2 42.2c15.5 7.6 20.8 12.6 20.8 19.3c-.2 10.4-12.6 15.2-24.1 15.2c-16 0-24.6-2.5-37.7-8.3l-5.3-2.5l-5.6 34.9c9.4 4.3 26.8 8.1 44.8 8.3c42.2.1 69.7-20.8 70-53M528 331.4L495.6 176h-31.1c-9.6 0-16.9 2.8-21 12.9l-59.7 142.5H426s6.9-19.2 8.4-23.3H486c1.2 5.5 4.8 23.3 4.8 23.3z" />
    </symbol>
    <symbol id="pen-new-round" viewBox="0 0 24 24">
      <path fill="currentColor" fill-rule="evenodd"
        d="M1.25 12C1.25 6.063 6.063 1.25 12 1.25a.75.75 0 0 1 0 1.5A9.25 9.25 0 1 0 21.25 12a.75.75 0 0 1 1.5 0c0 5.937-4.813 10.75-10.75 10.75S1.25 17.937 1.25 12m15.52-9.724a3.503 3.503 0 0 1 4.954 4.953l-6.648 6.649c-.371.37-.604.604-.863.806a5.34 5.34 0 0 1-.987.61c-.297.141-.61.245-1.107.411l-2.905.968a1.492 1.492 0 0 1-1.887-1.887l.968-2.905c.166-.498.27-.81.411-1.107c.167-.35.372-.68.61-.987c.202-.26.435-.492.806-.863zm3.893 1.06a2.003 2.003 0 0 0-2.832 0l-.376.377c.022.096.054.21.098.338c.143.413.415.957.927 1.469a3.875 3.875 0 0 0 1.807 1.025l.376-.376a2.003 2.003 0 0 0 0-2.832m-1.558 4.391a5.397 5.397 0 0 1-1.686-1.146a5.395 5.395 0 0 1-1.146-1.686L11.218 9.95c-.417.417-.58.582-.72.76a3.84 3.84 0 0 0-.437.71c-.098.203-.172.423-.359.982l-.431 1.295l1.032 1.033l1.295-.432c.56-.187.779-.261.983-.358c.251-.12.49-.267.71-.439c.177-.139.342-.302.759-.718z"
        clip-rule="evenodd" />
    </symbol>
    <symbol id="mask-happly" viewBox="0 0 24 24">
      <path fill="currentColor"
        d="M7.17 9.335c.124-.247.587-.585 1.33-.585c.743 0 1.206.338 1.33.585a.75.75 0 1 0 1.34-.67C10.713 7.747 9.604 7.25 8.5 7.25s-2.212.497-2.67 1.415a.75.75 0 1 0 1.34.67m8.33-.585c-.743 0-1.206.338-1.33.585a.75.75 0 0 1-1.34-.67c.458-.918 1.566-1.415 2.67-1.415c1.104 0 2.212.497 2.67 1.415a.75.75 0 1 1-1.34.67c-.124-.247-.587-.585-1.33-.585" />
      <path fill="currentColor" fill-rule="evenodd"
        d="m8.835 2.212l-1.11-.185c-1.033-.172-1.888-.315-2.57-.331c-.716-.017-1.379.098-1.933.567c-.553.468-.776 1.104-.876 1.812c-.096.675-.096 1.54-.096 2.587V12c0 5.964 4.624 8.814 7.355 9.976l.027.012c.34.144.658.28 1.024.371c.386.096.796.137 1.344.137s.958-.04 1.344-.137c.366-.091.684-.227 1.024-.372l.027-.01c2.731-1.163 7.355-4.013 7.355-9.977V6.662c0-1.047 0-1.912-.096-2.587c-.1-.709-.323-1.344-.876-1.812c-.554-.47-1.217-.584-1.933-.567c-.682.016-1.537.159-2.57.331l-1.11.185c-1.664.277-2.414.4-3.165.4c-.751 0-1.501-.123-3.165-.4M4.192 3.407c.154-.13.384-.225.927-.211c.563.013 1.312.136 2.415.32l1.128.188c1.57.262 2.448.408 3.338.408c.89 0 1.767-.146 3.338-.408l1.128-.188c1.103-.184 1.852-.307 2.415-.32c.543-.014.773.08.927.211c.154.13.285.342.361.879c.08.557.081 1.315.081 2.433V12c0 5.017-3.854 7.495-6.442 8.596c-.371.158-.587.248-.827.308c-.23.057-.51.092-.981.092s-.751-.035-.981-.092c-.24-.06-.456-.15-.827-.308C7.604 19.495 3.75 17.016 3.75 12V6.719c0-1.118.002-1.876.081-2.433c.076-.537.207-.749.361-.879"
        clip-rule="evenodd" />
      <path fill="currentColor"
        d="M7.957 13.483a.753.753 0 0 0 .028 1.063l.03.027l.06.05c.05.04.117.093.203.152c.173.118.422.266.751.412c.663.29 1.64.563 2.971.563c1.33 0 2.308-.272 2.97-.563c.33-.146.58-.294.752-.412a3.046 3.046 0 0 0 .262-.202l.02-.018l.008-.006l.003-.003l.001-.002h.001a.75.75 0 0 0-1.026-1.095l-.006.005l-.01.008a1.557 1.557 0 0 1-.101.076c-.101.069-.268.17-.507.275c-.475.21-1.247.437-2.367.437c-1.12 0-1.892-.228-2.367-.437a3.126 3.126 0 0 1-.59-.335a.827.827 0 0 1-.019-.016l-.014-.012a.75.75 0 0 0-1.053.033" />
    </symbol>
    <symbol id="tag-price" viewBox="0 0 24 24">
      <path fill="currentColor" fill-rule="evenodd"
        d="M11.238 2.799c-.614.081-1.372.255-2.45.504l-1.229.284c-.91.21-1.538.356-2.017.52c-.463.159-.725.315-.922.513c-.198.197-.354.459-.513.922c-.164.479-.31 1.106-.52 2.017l-.284 1.228c-.249 1.079-.423 1.837-.504 2.451c-.08.598-.061 1.003.045 1.371c.105.368.304.721.688 1.186c.395.478.944 1.029 1.727 1.812l1.83 1.83c1.359 1.359 2.326 2.324 3.158 2.958c.814.622 1.41.855 2.015.855c.606 0 1.201-.233 2.016-.855c.831-.634 1.799-1.6 3.158-2.959c1.36-1.36 2.325-2.327 2.96-3.158c.62-.815.854-1.41.854-2.016c0-.605-.233-1.2-.855-2.015c-.634-.832-1.6-1.8-2.959-3.159l-1.83-1.83c-.782-.782-1.333-1.331-1.81-1.726c-.466-.384-.819-.583-1.187-.688c-.368-.106-.773-.124-1.37-.045m-.196-1.487c.717-.095 1.346-.092 1.98.09c.635.182 1.17.513 1.728.973c.54.446 1.14 1.046 1.891 1.797l1.896 1.896c1.31 1.31 2.348 2.348 3.05 3.27c.724.947 1.163 1.859 1.163 2.924c0 1.066-.439 1.978-1.162 2.925c-.703.922-1.74 1.96-3.051 3.27l-.08.08c-1.31 1.31-2.348 2.348-3.27 3.05c-.947.724-1.86 1.163-2.925 1.163c-1.065 0-1.977-.439-2.925-1.162c-.921-.703-1.959-1.74-3.27-3.051L4.173 16.64c-.75-.75-1.351-1.351-1.797-1.89c-.46-.559-.791-1.094-.973-1.728c-.182-.635-.185-1.264-.09-1.981c.091-.694.283-1.522.521-2.556l.3-1.303c.2-.863.362-1.567.555-2.128c.202-.587.455-1.08.871-1.496c.416-.416.91-.67 1.496-.87c.561-.194 1.265-.356 2.128-.555l1.303-.3c1.034-.24 1.862-.43 2.556-.522M9.49 7.995a1.25 1.25 0 1 0-1.768 1.768A1.25 1.25 0 0 0 9.49 7.995m-2.829-1.06a2.75 2.75 0 1 1 3.89 3.889a2.75 2.75 0 0 1-3.89-3.89m6.33 5.172a.88.88 0 0 0-.608.277c-.388.388-.286.775-.177.884c.11.109.497.21.884-.177c.784-.784 2.138-1.044 3.005-.177c.673.673.668 1.639.265 2.404a.75.75 0 0 1-1.04 1.045a2.202 2.202 0 0 1-1.472.232a.75.75 0 1 1 .302-1.47c.177.037.463-.02.708-.266c.387-.388.286-.775.177-.884c-.11-.109-.497-.21-.884.177c-.784.784-2.138 1.044-3.005.177c-.673-.673-.668-1.639-.265-2.404a.75.75 0 0 1 1.04-1.045c.34-.181.713-.277 1.085-.273a.75.75 0 0 1-.014 1.5"
        clip-rule="evenodd" />
    </symbol>
    <symbol id="user-speak" viewBox="0 0 24 24">
      <path fill="currentColor"
        d="M18.357 1.614a.75.75 0 0 1 1.029-.257L19 2l.386-.643h.001l.002.002l.004.002l.01.006a2.216 2.216 0 0 1 .113.076c.07.049.166.12.277.212c.222.185.512.462.802.838c.582.757 1.155 1.914 1.155 3.507c0 1.593-.573 2.75-1.155 3.507c-.29.376-.58.653-.802.838a4.16 4.16 0 0 1-.363.27l-.028.018l-.01.006l-.003.002l-.002.001s-.001.001-.387-.642l.386.643a.75.75 0 0 1-.776-1.283l.005-.004l.041-.027a2.7 2.7 0 0 0 .177-.136c.152-.128.362-.326.573-.6c.417-.543.844-1.386.844-2.593s-.427-2.05-.844-2.593a3.809 3.809 0 0 0-.573-.6a2.704 2.704 0 0 0-.218-.163l-.005-.004a.75.75 0 0 1-.253-1.026" />
      <path fill="currentColor" fill-rule="evenodd"
        d="M10 1.25a4.75 4.75 0 1 0 0 9.5a4.75 4.75 0 0 0 0-9.5M6.75 6a3.25 3.25 0 1 1 6.5 0a3.25 3.25 0 0 1-6.5 0M10 12.25c-2.313 0-4.445.526-6.024 1.414C2.42 14.54 1.25 15.866 1.25 17.5v.102c-.001 1.162-.002 2.62 1.277 3.662c.629.512 1.51.877 2.7 1.117c1.192.242 2.747.369 4.773.369s3.58-.127 4.774-.369c1.19-.24 2.07-.605 2.7-1.117c1.279-1.042 1.277-2.5 1.276-3.662V17.5c0-1.634-1.17-2.96-2.725-3.836c-1.58-.888-3.711-1.414-6.025-1.414M2.75 17.5c0-.851.622-1.775 1.961-2.528c1.316-.74 3.184-1.222 5.29-1.222c2.104 0 3.972.482 5.288 1.222c1.34.753 1.961 1.677 1.961 2.528c0 1.308-.04 2.044-.724 2.6c-.37.302-.99.597-2.05.811c-1.057.214-2.502.339-4.476.339c-1.974 0-3.42-.125-4.476-.339c-1.06-.214-1.68-.509-2.05-.81c-.684-.557-.724-1.293-.724-2.601"
        clip-rule="evenodd" />
      <path fill="currentColor"
        d="M17.386 3.357a.75.75 0 0 0-1.029.257l.248 1.024l.008.005a1.529 1.529 0 0 1 .293.29A1.7 1.7 0 0 1 17.25 6c0 .507-.177.85-.344 1.068a1.53 1.53 0 0 1-.293.29l-.008.004a.75.75 0 0 0 .781 1.281L17 8l.386.643h.001l.002-.002l.003-.001l.007-.005l.02-.012l.054-.037a3.027 3.027 0 0 0 .621-.604A3.2 3.2 0 0 0 18.75 6a3.2 3.2 0 0 0-.655-1.982a3.027 3.027 0 0 0-.622-.604a1.749 1.749 0 0 0-.054-.037l-.02-.012l-.007-.005l-.003-.001l-.002-.001S17.386 3.357 17 4z" />
    </symbol>
    <symbol id="clock-square" viewBox="0 0 24 24">
      <path fill="currentColor" fill-rule="evenodd"
        d="M11.943 1.25h.114c2.309 0 4.118 0 5.53.19c1.444.194 2.584.6 3.479 1.494c.895.895 1.3 2.035 1.494 3.48c.19 1.411.19 3.22.19 5.529v.114c0 2.309 0 4.118-.19 5.53c-.194 1.444-.6 2.584-1.494 3.479c-.895.895-2.035 1.3-3.48 1.494c-1.411.19-3.22.19-5.529.19h-.114c-2.309 0-4.118 0-5.53-.19c-1.444-.194-2.584-.6-3.479-1.494c-.895-.895-1.3-2.035-1.494-3.48c-.19-1.411-.19-3.22-.19-5.529v-.114c0-2.309 0-4.118.19-5.53c.194-1.444.6-2.584 1.494-3.479c.895-.895 2.035-1.3 3.48-1.494c1.411-.19 3.22-.19 5.529-.19m-5.33 1.676c-1.278.172-2.049.5-2.618 1.069c-.57.57-.897 1.34-1.069 2.619c-.174 1.3-.176 3.008-.176 5.386s.002 4.086.176 5.386c.172 1.279.5 2.05 1.069 2.62c.57.569 1.34.896 2.619 1.068c1.3.174 3.008.176 5.386.176s4.086-.002 5.386-.176c1.279-.172 2.05-.5 2.62-1.069c.569-.57.896-1.34 1.068-2.619c.174-1.3.176-3.008.176-5.386s-.002-4.086-.176-5.386c-.172-1.279-.5-2.05-1.069-2.62c-.57-.569-1.34-.896-2.619-1.068c-1.3-.174-3.008-.176-5.386-.176s-4.086.002-5.386.176M12 7.25a.75.75 0 0 1 .75.75v3.69l2.28 2.28a.75.75 0 1 1-1.06 1.06l-2.134-2.134c-.29-.289-.434-.433-.51-.617c-.076-.184-.076-.388-.076-.797V8a.75.75 0 0 1 .75-.75"
        clip-rule="evenodd" />
    </symbol>
    <symbol id="arrow-down" viewBox="0 0 24 24">
      <path fill="currentColor" d="m7 10l5 5l5-5z" />
    </symbol>
    <symbol id="check-circle" viewBox="0 0 512 512">
      <path fill="currentColor"
        d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248s248-111.033 248-248S392.967 8 256 8m0 48c110.532 0 200 89.451 200 200c0 110.532-89.451 200-200 200c-110.532 0-200-89.451-200-200c0-110.532 89.451-200 200-200m140.204 130.267l-22.536-22.718c-4.667-4.705-12.265-4.736-16.97-.068L215.346 303.697l-59.792-60.277c-4.667-4.705-12.265-4.736-16.97-.069l-22.719 22.536c-4.705 4.667-4.736 12.265-.068 16.971l90.781 91.516c4.667 4.705 12.265 4.736 16.97.068l172.589-171.204c4.704-4.668 4.734-12.266.067-16.971" />
    </symbol>
    <symbol id="play-button" viewBox="0 0 24 24">
      <path fill="currentColor"
        d="M9.5 15.584V8.416a.5.5 0 0 1 .77-.42l5.576 3.583a.5.5 0 0 1 0 .842l-5.576 3.584a.5.5 0 0 1-.77-.42Z" />
      <path fill="currentColor"
        d="M1 12C1 5.925 5.925 1 12 1s11 4.925 11 11s-4.925 11-11 11S1 18.075 1 12m11-9.5A9.5 9.5 0 0 0 2.5 12a9.5 9.5 0 0 0 9.5 9.5a9.5 9.5 0 0 0 9.5-9.5A9.5 9.5 0 0 0 12 2.5" />
    </symbol>
    <symbol id="navbar-icon" viewBox="0 0 16 16">
      <path
        d="M14 10.5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0 0 1h3a.5.5 0 0 0 .5-.5zm0-3a.5.5 0 0 0-.5-.5h-7a.5.5 0 0 0 0 1h7a.5.5 0 0 0 .5-.5zm0-3a.5.5 0 0 0-.5-.5h-11a.5.5 0 0 0 0 1h11a.5.5 0 0 0 .5-.5z" />
    </symbol>
    <symbol id="location" viewBox="0 0 24 24">
      <path fill="currentColor" fill-rule="evenodd"
        d="M3.25 10.143C3.25 5.244 7.155 1.25 12 1.25c4.845 0 8.75 3.994 8.75 8.893c0 2.365-.674 4.905-1.866 7.099c-1.19 2.191-2.928 4.095-5.103 5.112a4.2 4.2 0 0 1-3.562 0c-2.175-1.017-3.913-2.92-5.103-5.112c-1.192-2.194-1.866-4.734-1.866-7.099M12 2.75c-3.992 0-7.25 3.297-7.25 7.393c0 2.097.603 4.392 1.684 6.383c1.082 1.993 2.612 3.624 4.42 4.469a2.7 2.7 0 0 0 2.291 0c1.809-.845 3.339-2.476 4.421-4.469c1.081-1.99 1.684-4.286 1.684-6.383c0-4.096-3.258-7.393-7.25-7.393m0 5a2.25 2.25 0 1 0 0 4.5a2.25 2.25 0 0 0 0-4.5M8.25 10a3.75 3.75 0 1 1 7.5 0a3.75 3.75 0 0 1-7.5 0"
        clip-rule="evenodd" />
    </symbol>
    <symbol id="phone" viewBox="0 0 24 24">
      <path fill="currentColor" fill-rule="evenodd"
        d="M4.718 3.092c1.226-1.291 3.254-1.05 4.268.384l1.26 1.784c.811 1.147.743 2.74-.225 3.76l-.245.257a.25.25 0 0 0-.002.006c-.013.036-.045.152-.013.372c.067.455.418 1.381 1.846 2.884c1.432 1.508 2.3 1.863 2.703 1.929a.608.608 0 0 0 .294-.007l.408-.43c.874-.92 2.236-1.101 3.335-.469l1.91 1.1c1.633.94 2.013 3.239.708 4.613l-1.42 1.495c-.443.467-1.048.866-1.795.94c-1.824.18-6.049-.055-10.478-4.719c-4.134-4.351-4.919-8.136-5.018-9.985l.666-.036l-.666.036c-.049-.914.358-1.697.894-2.262zm3.043 1.25c-.512-.724-1.433-.768-1.956-.217l-1.57 1.652c-.33.35-.505.75-.483 1.149c.08 1.51.731 4.952 4.607 9.032c4.064 4.28 7.809 4.4 9.244 4.259c.283-.028.575-.186.854-.48l1.42-1.495c.614-.646.453-1.808-.368-2.28l-1.91-1.1c-.513-.295-1.114-.204-1.499.202l-.456.48l-.527-.501c.527.5.527.501.526.502l-.001.001l-.003.004l-.007.006l-.014.014a1.007 1.007 0 0 1-.136.112c-.08.056-.186.119-.321.172c-.276.109-.64.167-1.091.094c-.878-.142-2.028-.773-3.55-2.376c-1.528-1.608-2.113-2.807-2.243-3.7c-.067-.454-.014-.817.084-1.092a1.591 1.591 0 0 1 .23-.427l.03-.037l.014-.015l.006-.007l.003-.003l.002-.001s0-.002.533.503l-.532-.505l.287-.302c.445-.469.51-1.263.088-1.86z"
        clip-rule="evenodd" />
      <path fill="currentColor"
        d="M13.26 1.88a.751.751 0 0 1 .861-.62c.025.005.107.02.15.03c.085.018.204.048.352.09c.297.087.712.23 1.21.458c.996.457 2.321 1.256 3.697 2.631c1.376 1.376 2.175 2.702 2.632 3.698c.228.498.37.912.457 1.21a5.727 5.727 0 0 1 .113.454l.005.031a.765.765 0 0 1-.617.878a.75.75 0 0 1-.86-.617a2.82 2.82 0 0 0-.081-.327a7.395 7.395 0 0 0-.38-1.004c-.39-.85-1.092-2.024-2.33-3.262c-1.237-1.238-2.411-1.939-3.262-2.329a7.394 7.394 0 0 0-1.003-.38a5.749 5.749 0 0 0-.318-.08a.759.759 0 0 1-.626-.861" />
      <path fill="currentColor" fill-rule="evenodd"
        d="M13.486 5.33a.75.75 0 0 1 .927-.516l-.206.721l.207-.72h.002l.004.001l.007.002l.02.007a2.995 2.995 0 0 1 .233.089c.146.062.345.158.59.303c.49.29 1.157.77 1.942 1.556c.785.785 1.267 1.453 1.556 1.942c.145.245.241.444.304.59a2.968 2.968 0 0 1 .089.233l.006.02l.002.008l.001.003v.002l-.72.207l.721-.206a.75.75 0 0 1-1.44.422l-.003-.01a3.67 3.67 0 0 0-.25-.504c-.224-.377-.626-.947-1.326-1.647c-.7-.7-1.27-1.102-1.646-1.325a3.674 3.674 0 0 0-.504-.25l-.01-.004a.75.75 0 0 1-.506-.925"
        clip-rule="evenodd" />
    </symbol>
    <symbol id="email" viewBox="0 0 24 24">
      <path fill="currentColor" fill-rule="evenodd"
        d="M9.944 3.25h4.112c1.838 0 3.294 0 4.433.153c1.172.158 2.121.49 2.87 1.238c.748.749 1.08 1.698 1.238 2.87c.153 1.14.153 2.595.153 4.433v.112c0 1.838 0 3.294-.153 4.433c-.158 1.172-.49 2.121-1.238 2.87c-.749.748-1.698 1.08-2.87 1.238c-1.14.153-2.595.153-4.433.153H9.944c-1.838 0-3.294 0-4.433-.153c-1.172-.158-2.121-.49-2.87-1.238c-.748-.749-1.08-1.698-1.238-2.87c-.153-1.14-.153-2.595-.153-4.433v-.112c0-1.838 0-3.294.153-4.433c.158-1.172.49-2.121 1.238-2.87c.749-.748 1.698-1.08 2.87-1.238c1.14-.153 2.595-.153 4.433-.153M5.71 4.89c-1.006.135-1.586.389-2.01.812c-.422.423-.676 1.003-.811 2.009c-.138 1.028-.14 2.382-.14 4.289c0 1.907.002 3.262.14 4.29c.135 1.005.389 1.585.812 2.008c.423.423 1.003.677 2.009.812c1.028.138 2.382.14 4.289.14h4c1.907 0 3.262-.002 4.29-.14c1.005-.135 1.585-.389 2.008-.812c.423-.423.677-1.003.812-2.009c.138-1.028.14-2.382.14-4.289c0-1.907-.002-3.261-.14-4.29c-.135-1.005-.389-1.585-.812-2.008c-.423-.423-1.003-.677-2.009-.812c-1.027-.138-2.382-.14-4.289-.14h-4c-1.907 0-3.261.002-4.29.14m-.287 2.63a.75.75 0 0 1 1.056-.096L8.64 9.223c.933.777 1.58 1.315 2.128 1.667c.529.34.888.455 1.233.455c.345 0 .704-.114 1.233-.455c.547-.352 1.195-.89 2.128-1.667l2.159-1.8a.75.75 0 1 1 .96 1.153l-2.196 1.83c-.887.74-1.605 1.338-2.24 1.746c-.66.425-1.303.693-2.044.693c-.741 0-1.384-.269-2.045-.693c-.634-.408-1.352-1.007-2.239-1.745L5.52 8.577a.75.75 0 0 1-.096-1.057"
        clip-rule="evenodd" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="clock" viewBox="0 0 24 24">
      <path fill="currentColor" fill-rule="evenodd"
        d="M12 2.75a9.25 9.25 0 1 0 0 18.5a9.25 9.25 0 0 0 0-18.5M1.25 12C1.25 6.063 6.063 1.25 12 1.25S22.75 6.063 22.75 12S17.937 22.75 12 22.75S1.25 17.937 1.25 12M12 7.25a.75.75 0 0 1 .75.75v3.69l2.28 2.28a.75.75 0 1 1-1.06 1.06l-2.5-2.5a.75.75 0 0 1-.22-.53V8a.75.75 0 0 1 .75-.75"
        clip-rule="evenodd" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="star" viewBox="0 0 512 512">
      <path fill="currentColor"
        d="M394 480a16 16 0 0 1-9.39-3L256 383.76L127.39 477a16 16 0 0 1-24.55-18.08L153 310.35L23 221.2a16 16 0 0 1 9-29.2h160.38l48.4-148.95a16 16 0 0 1 30.44 0l48.4 149H480a16 16 0 0 1 9.05 29.2L359 310.35l50.13 148.53A16 16 0 0 1 394 480" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="play-circle" viewBox="0 0 24 24">
      <path fill="currentColor"
        d="m9.5 16.5l7-4.5l-7-4.5zM12 22q-2.075 0-3.9-.788t-3.175-2.137q-1.35-1.35-2.137-3.175T2 12q0-2.075.788-3.9t2.137-3.175q1.35-1.35 3.175-2.137T12 2q2.075 0 3.9.788t3.175 2.137q1.35 1.35 2.138 3.175T22 12q0 2.075-.788 3.9t-2.137 3.175q-1.35 1.35-3.175 2.138T12 22m0-2q3.35 0 5.675-2.325T20 12q0-3.35-2.325-5.675T12 4Q8.65 4 6.325 6.325T4 12q0 3.35 2.325 5.675T12 20m0-8" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="facebook" viewBox="0 0 24 24">
      <path fill="currentColor"
        d="M22 12c0-5.52-4.48-10-10-10S2 6.48 2 12c0 4.84 3.44 8.87 8 9.8V15H8v-3h2V9.5C10 7.57 11.57 6 13.5 6H16v3h-2c-.55 0-1 .45-1 1v2h3v3h-3v6.95c5.05-.5 9-4.76 9-9.95z" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="youtube" viewBox="0 0 32 32">
      <path fill="currentColor"
        d="M29.41 9.26a3.5 3.5 0 0 0-2.47-2.47C24.76 6.2 16 6.2 16 6.2s-8.76 0-10.94.59a3.5 3.5 0 0 0-2.47 2.47A36.13 36.13 0 0 0 2 16a36.13 36.13 0 0 0 .59 6.74a3.5 3.5 0 0 0 2.47 2.47c2.18.59 10.94.59 10.94.59s8.76 0 10.94-.59a3.5 3.5 0 0 0 2.47-2.47A36.13 36.13 0 0 0 30 16a36.13 36.13 0 0 0-.59-6.74ZM13.2 20.2v-8.4l7.27 4.2Z" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="instagram" viewBox="0 0 256 256">
      <path fill="currentColor"
        d="M128 80a48 48 0 1 0 48 48a48.05 48.05 0 0 0-48-48Zm0 80a32 32 0 1 1 32-32a32 32 0 0 1-32 32Zm48-136H80a56.06 56.06 0 0 0-56 56v96a56.06 56.06 0 0 0 56 56h96a56.06 56.06 0 0 0 56-56V80a56.06 56.06 0 0 0-56-56Zm40 152a40 40 0 0 1-40 40H80a40 40 0 0 1-40-40V80a40 40 0 0 1 40-40h96a40 40 0 0 1 40 40ZM192 76a12 12 0 1 1-12-12a12 12 0 0 1 12 12Z" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="twitter" viewBox="0 0 24 24">
      <path fill="currentColor"
        d="M22.46 6c-.77.35-1.6.58-2.46.69c.88-.53 1.56-1.37 1.88-2.38c-.83.5-1.75.85-2.72 1.05C18.37 4.5 17.26 4 16 4c-2.35 0-4.27 1.92-4.27 4.29c0 .34.04.67.11.98C8.28 9.09 5.11 7.38 3 4.79c-.37.63-.58 1.37-.58 2.15c0 1.49.75 2.81 1.91 3.56c-.71 0-1.37-.2-1.95-.5v.03c0 2.08 1.48 3.82 3.44 4.21a4.22 4.22 0 0 1-1.93.07a4.28 4.28 0 0 0 4 2.98a8.521 8.521 0 0 1-5.33 1.84c-.34 0-.68-.02-1.02-.06C3.44 20.29 5.7 21 8.12 21C16 21 20.33 14.46 20.33 8.79c0-.19 0-.37-.01-.56c.84-.6 1.56-1.36 2.14-2.23Z" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="linkedin" viewBox="0 0 512 512">
      <path fill="currentColor"
        d="M444.17 32H70.28C49.85 32 32 46.7 32 66.89v374.72C32 461.91 49.85 480 70.28 480h373.78c20.54 0 35.94-18.21 35.94-38.39V66.89C480.12 46.7 464.6 32 444.17 32Zm-273.3 373.43h-64.18V205.88h64.18ZM141 175.54h-.46c-20.54 0-33.84-15.29-33.84-34.43c0-19.49 13.65-34.42 34.65-34.42s33.85 14.82 34.31 34.42c-.01 19.14-13.31 34.43-34.66 34.43Zm264.43 229.89h-64.18V296.32c0-26.14-9.34-44-32.56-44c-17.74 0-28.24 12-32.91 23.69c-1.75 4.2-2.22 9.92-2.22 15.76v113.66h-64.18V205.88h64.18v27.77c9.34-13.3 23.93-32.44 57.88-32.44c42.13 0 74 27.77 74 87.64Z" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="search" viewBox="0 0 512 512">
      <path fill="currentColor"
        d="M456.69 421.39L362.6 327.3a173.81 173.81 0 0 0 34.84-104.58C397.44 126.38 319.06 48 222.72 48S48 126.38 48 222.72s78.38 174.72 174.72 174.72A173.81 173.81 0 0 0 327.3 362.6l94.09 94.09a25 25 0 0 0 35.3-35.3M97.92 222.72a124.8 124.8 0 1 1 124.8 124.8a124.95 124.95 0 0 1-124.8-124.8" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="arrow-down" viewBox="0 0 16 16">
      <path fill-rule="evenodd"
        d="M1.646 4.646a.5.5 0 0 1 .708 0L8 10.293l5.646-5.647a.5.5 0 0 1 .708.708l-6 6a.5.5 0 0 1-.708 0l-6-6a.5.5 0 0 1 0-.708z" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="plus" viewBox="0 0 16 16">
      <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z" />
    </symbol>
    <symbol xmlns="http://www.w3.org/2000/svg" id="minus" viewBox="0 0 16 16">
      <path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z" />
    </symbol>
  </svg>



	<%@ include file="header.jsp" %>
	<%@ include file="banner.jsp" %>
	<%@ include file="container.jsp" %>
	<%@ include file="footer.jsp" %>
	
  <!-- Video Popup -->
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
    aria-hidden="true">
    <div class="modal-dialog" role="document">

      <div class="modal-content">

        <div class="modal-body">
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"><svg class="bi" width="40"
              height="40">
              <use xlink:href="#close-sharp"></use>
            </svg></button>
          <div class="ratio ratio-16x9">
            <iframe class="embed-responsive-item" src="" id="video" allowscriptaccess="always"
              allow="autoplay"></iframe>
          </div>
        </div>

      </div>

    </div>
  </div>

  <script src="js/jquery-1.11.0.min.js"></script>
  <script type="text/javascript" src="js/bootstrap.bundle.min.js"></script>
  <script type="text/javascript" src="js/plugins.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js"></script>
  <script type="text/javascript" src="js/script.js"></script>
  <script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
</body>

</html>