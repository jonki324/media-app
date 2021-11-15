from django.contrib.auth.models import AbstractBaseUser, BaseUserManager
from django.db import models


class UserManager(BaseUserManager):
    def create_user(self, login_id, password=None):
        if not login_id:
            raise ValueError("Users must have an login_id")
        user = self.model(
            login_id=login_id,
        )
        user.set_password(password)
        user.save(using=self._db)
        return user

    def create_superuser(self, login_id, password=None):
        user = self.model(
            login_id=login_id,
        )
        user.set_password(password)
        user.is_staff = True
        user.is_superuser = True
        user.save(using=self._db)
        return user


class User(AbstractBaseUser):
    login_id = models.CharField(max_length=255, unique=True, verbose_name="Login ID")
    is_active = models.BooleanField(default=True)
    is_staff = models.BooleanField(default=False)
    is_superuser = models.BooleanField(default=False)

    objects = UserManager()

    USERNAME_FIELD = "login_id"

    def __str__(self):
        return self.login_id

    def has_perm(self, perm, obj=None):
        return True

    def has_module_perms(self, app_label):
        return True
