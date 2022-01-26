json.extract! student, :id, :name, :major, :gpa, :created_at, :updated_at
json.url student_url(student, format: :json)
