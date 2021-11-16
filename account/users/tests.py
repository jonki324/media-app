from django.test import TestCase

from .models import User


class UserModelTests(TestCase):
    def test_user_manager_create_user(self):
        login_id = "test_user_id"
        password = "test_user_pass"
        user = User.objects.create_user(login_id=login_id, password=password)
        self.assertEqual(user.login_id, login_id)
        self.assertTrue(user.check_password(password))
        self.assertTrue(user.is_active)
        self.assertFalse(user.is_staff)
        self.assertFalse(user.is_superuser)

    def test_user_manager_create_superuser(self):
        login_id = "test_super_id"
        password = "test_super_pass"
        super_user = User.objects.create_superuser(login_id=login_id, password=password)
        self.assertEqual(super_user.login_id, login_id)
        self.assertTrue(super_user.check_password(password))
        self.assertTrue(super_user.is_active)
        self.assertTrue(super_user.is_staff)
        self.assertTrue(super_user.is_superuser)
