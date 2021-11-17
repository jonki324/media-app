import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { CssBaseline } from '@mui/material';
import AboutPage from '../../features/About/AboutPage';
import ArticlePage from '../../features/Article/ArticlePage';
import ArticleEditorPage from '../../features/ArticleEditor/ArticleEditorPage';
import HomePage from '../../features/Home/HomePage';
import LoginPage from '../../features/Login/LoginPage';
import MyPage from '../../features/MyPage/MyPage';
import ProfilePage from '../../features/Profile/ProfilePage';
import SettingPage from '../../features/Setting/SettingPage';
import SignupPage from '../../features/Signup/SignupPage';

const App: React.FC = () => {
  return (
    <>
      <CssBaseline />
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="/about" element={<AboutPage />} />
          <Route path="/article" element={<ArticlePage />} />
          <Route path="/editor" element={<ArticleEditorPage />} />
          <Route path="/login" element={<LoginPage />} />
          <Route path="/mypage" element={<MyPage />} />
          <Route path="/profile" element={<ProfilePage />} />
          <Route path="/setting" element={<SettingPage />} />
          <Route path="/signup" element={<SignupPage />} />
        </Routes>
      </BrowserRouter>
    </>
  );
};

export default App;
