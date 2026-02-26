/* Video Control Script */
var video = $("video");
var btn = $("#car_btn");
console.log(video);
console.log(btn);
// 버튼을 클릭했을때 (경고창) 캡, 넘
btn.click(function () {
  if (video.get(0).paused) {
    video.get(0).play();
    btn.html('<i class="fa fa-pause-circle-o" aria-hidden="true"></i>');
  } else {
    video.get(0).pause();
    btn.html('<i class="fa fa-play-circle-o" aria-hidden="true"></i>');
  }
});
/* Video Sound Control Script */
var btn2 = $("#car_sound");
video.prop("muted", true);
btn2.click(function () {
  // muted 상태일때
  if (video.prop("muted")) {
    video.prop("muted", false); //음재생
    btn2.html('<i class="fa fa-volume-up" aria-hidden="true"></i>');
  } else {
    video.prop("muted", true); //음소거
    btn2.html('<i class="fa fa-volume-off" aria-hidden="true"></i>');
  }
});
