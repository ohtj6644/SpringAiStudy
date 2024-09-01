
    var questionGPT = function() {
    var question = $("#questionInput").val();

            $.ajax({
                type: 'POST',
                url: '/chat',
                data: JSON.stringify(question),
                success: function (data) {
                $("#answer").text(data);
                },
                error: function (xhr) {
                    // 실패 시 적절한 처리
                    if (xhr.status === 400) {
                        alert(xhr.responseText); // 서버에서 전달한 오류 메시지 팝업창 표시
                    } else {
                        console.error('Ajax 요청 실패:', xhr);
                    }
                }
            });
