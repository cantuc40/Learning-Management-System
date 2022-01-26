class Student < ApplicationRecord

    validates_presence_of :name
    has_many :courses, dependent: :destroy
end
