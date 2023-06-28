// 내용의 값의 빈공백을 trim(앞/뒤)
String.prototype.trim = function() {
		var TRIM_PATTERN = /(^\s*)|(\s*$)/g;
		return this.replace(TRIM_PATTERN, "");
};

// E-Mail 검사
function isValidEmail(email) {
	var format = /^((\w|[\-\.])+)@((\w|[\-\.])+)\.([A-Za-z]+)$/;
    if (email.search(format) != -1)
        return true; //올바른 포맷 형식
    return false;
}

// 한글 필터링
function isValidKorean(data){
     // UTF-8 코드 중 AC00부터 D7A3 값이지 검사
	var format = /^[\uac00-\ud7a3]*$/g;
    if (data.search(format) != -1)
        return true; //올바른 포맷 형식
    return false;
}

// 날짜 검사
function isValidDate(year, month, day) {
	var days = new Array (31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

     if(year%4==0 && year%100 !=0 || year%400==0)
       days[1]=29;
     else
       days[1]=28;

     if(month < 1 || month > 12)
       return false;

     if(day > days[month-1] || day < 1)
       return false;
     return true;
}

//이미지 업로드
var submit = document.getElementById('submitButton');
submit.onclick = showImage;     //Submit 버튼 클릭시 이미지 보여주기

function showImage() {
    var newImage = document.getElementById('image-show').lastElementChild;
    newImage.style.visibility = "visible";
    
    document.getElementById('image-upload').style.visibility = 'hidden';

    document.getElementById('fileName').textContent = null;     //기존 파일 이름 지우기
}


function loadFile(input) {
    var file = input.files[0];

    var name = document.getElementById('fileName');
    name.textContent = file.name;

    var newImage = document.createElement("img");
    newImage.setAttribute("class", 'img');

    newImage.src = URL.createObjectURL(file);   

    newImage.style.width = "70%";
    newImage.style.height = "70%";
    newImage.style.visibility = "hidden";   //버튼을 누르기 전까지는 이미지 숨기기
    newImage.style.objectFit = "contain";

    var container = document.getElementById('image-show');
    container.appendChild(newImage);
};