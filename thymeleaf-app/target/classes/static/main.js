/**
 * 
 */

$('document').ready(function() {
	$('.table.btn').on('click', function(event) {

		event.preventDefault();
		var href = $(this).attr('href');

		$.get(href, function(student, status) {
			$('#idedit').val(student.id);
			$('#employee_firstnameedit').val(student.employee_firstname);
			$('#employee_lastnameedit').val(student.employee_lastname);
			$('#email_idedit').val(student.email.id);

		});


		$('#editModal').modal();

	});

	$('.table #deleteButton').on('click', function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();
	});
});
