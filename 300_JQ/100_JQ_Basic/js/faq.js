// $(document).ready(function () {
//   // 각 항목 열기/닫기
//   $(".open1").click(function () {
//     $(this).parent().next().stop().show();
//   });
//   $(".close1").click(function () {
//     $(this).parent().next().stop().hide();
//   });
//   // 모두 열기, 모두 닫기
//   $(".open").click(function () {
//     $("article p").stop().slideDown();
//   });
//   $(".close").click(function () {
//     $("article p").stop().slideUp();
//   });
// });

document.addEventListener("DOMContentLoaded", function () {
  var openBtn = document.querySelectorAll(".open1");
  console.log(openBtn);

  //각 항목 열기
  for (var i = 0; i < openBtn.length; i++) {
    openBtn[i].addEventListener("click", function () {
      this.parentElement.nextElementSibling.style.display = "block";
    });
  }

  //각 항목 닫기
  var closeBtn = document.querySelectorAll(".close1");

  for (var i = 0; i < closeBtn.length; i++) {
    closeBtn[i].addEventListener("click", function () {
      this.parentElement.nextElementSibling.style.display = "none";
    });
  }

  //모두 열기
  var openAll = document.querySelector(".open");

  openAll.addEventListener("click", function () {
    var allContents = document.querySelectorAll("article p");
    for (var i = 0; i < allContents.length; i++) {
      allContents[i].style.display = "block";
    }
  });

  //모두 닫기
  var closeAll = document.querySelector(".close");

  closeAll.addEventListener("click", function () {
    var allContents = document.querySelectorAll("article p");
    for (var i = 0; i < allContents.length; i++) {
      allContents[i].style.display = "none";
    }
  });
});
